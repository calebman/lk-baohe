package com.lk.baohe;

import java.util.Iterator;
import java.util.List;

public class Leetcode341 {

    /**
     * Your NestedIterator object will be instantiated and called as such:
     * NestedIterator i = new NestedIterator(nestedList);
     * while (i.hasNext()) v[f()] = i.next();
     */
    static class NestedIterator implements Iterator<Integer> {

        public NestedIterator(List<NestedInteger> nestedList) {

        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }

    /**
     * This is the interface that allows for creating nested lists.
     * You should not implement it, or speculate about its implementation
     */
    public interface NestedInteger {

        /**
         * is integer
         *
         * @return true if this NestedInteger holds a single integer, rather than a nested list.
         */
        boolean isInteger();

        /**
         * get integer
         *
         * @return the single integer that this NestedInteger holds, if it holds a single integer
         * Return null if this NestedInteger holds a nested list
         */
        Integer getInteger();

        /**
         * get list
         *
         * @return the nested list that this NestedInteger holds, if it holds a nested list
         * Return null if this NestedInteger holds a single integer
         */
        List<NestedInteger> getList();
    }
}
