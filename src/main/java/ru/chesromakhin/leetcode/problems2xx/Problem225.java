package ru.chesromakhin.leetcode.problems2xx;

import java.util.LinkedList;
import java.util.Queue;

public class Problem225 {

  static class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
      queue.add(x);
    }

    public int pop() {
      int size = queue.size() - 1;
      for (int i = 0; i < size; i++) {
        queue2.add(queue.poll());
      }

      int elem = queue.poll();

      Queue<Integer> q3 = queue;
      queue = queue2;
      queue2 = q3;

      return elem;
    }

    public int top() {
      int elem = -1;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        elem = queue.poll();
        queue2.add(elem);
      }

      Queue<Integer> q3 = queue;
      queue = queue2;
      queue2 = q3;

      return elem;
    }

    public boolean empty() {
      return queue.isEmpty();
    }
  }

}
