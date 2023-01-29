package ru.chesromakhin.leetcode.problems4xx;

import java.util.*;

public class Problem460 {

  public static void main(String[] args) {
    LFUCache lfu = new LFUCache(2);
    lfu.put(1, 1);
    lfu.put(2, 2);
    System.out.println(lfu.get(1));
    lfu.put(3, 3);
    System.out.println(lfu.get(2));
    System.out.println(lfu.get(3));
    lfu.put(4, 4);
    System.out.println(lfu.get(1));
    System.out.println(lfu.get(3));
    System.out.println(lfu.get(4));
  }

}

class LFUCache {

  private final Map<Integer, Entry> cache;
  private final Map<Integer, LinkedList<Entry>> counts;
  private final int capacity;
  private int minCount;

  public LFUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>(capacity);
    this.counts = new HashMap<>();
    this.counts.put(1, new LinkedList<>());
    minCount = 1;
  }

  public int get(int key) {
    Entry entry = cache.get(key);
    if (entry == null) {
      return -1;
    }

    LinkedList<Entry> entries = counts.get(entry.count);
    entries.remove(entry);
    if (entries.isEmpty() && entry.count == minCount) {
      minCount++;
    }

    entry.count++;

    counts.computeIfAbsent(entry.count, (k) -> new LinkedList<>()).add(entry);

    return entry.value;
  }

  public void put(int key, int value) {
    if (capacity == 0) {
      return;
    }

    if (cache.containsKey(key)) {
      Entry entry = cache.get(key);
      int count = entry.count;
      LinkedList<Entry> entries = counts.get(count);
      entries.remove(entry);
      if (entries.isEmpty() && entry.count == minCount) {
        minCount++;
      }

      entry.value = value;
      entry.count++;

      counts.computeIfAbsent(entry.count, (k) -> new LinkedList<>()).add(entry);

      return;
    }

    if (cache.size() < this.capacity) {
      addClearEntry(key, value);
      return;
    }

    Entry replaceEntry = counts.get(minCount).removeFirst();
    cache.remove(replaceEntry.key);

    addClearEntry(key, value);
  }

  private void addClearEntry(int key, int value) {
    Entry entry = new Entry();
    entry.key = key;
    entry.value = value;
    entry.count = 1;
    minCount = 1;
    cache.put(key, entry);
    counts.get(1).add(entry);
  }

  private static class Entry {
    int key;
    int value;
    int count;

    @Override
    public String toString() {
      return key + "->" + value + "(" + count + ")";
    }
  }

}
