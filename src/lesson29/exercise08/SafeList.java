package lesson29.exercise08;

import java.util.*;

public class SafeList<T> implements List<T> {

    private final List<T> list;

    public SafeList(List<T> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return list.toArray(t1s);
    }

    @Override
    public boolean add(T t) {
        if (t == null)
            return false;
        if (contains(t))
            return false;

        return list.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return list.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        for (T t : collection) {
            add(t);
        }
        return true;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        for (T t : collection) {
            add(i, t);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return list.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return list.retainAll(collection);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public T get(int i) {
        if (isEmpty() || i >= size() || i < 0)
            return null;
        else
            return list.get(i);
    }

    @Override
    public T set(int i, T t) {
        if (isEmpty() || i >= size() || i < 0 || t == null || contains(t))
            return null;
        else
            return list.set(i, t);
    }

    @Override
    public void add(int i, T t) {
        if (i >= 0 && i < size()) {
            list.add(i, t);
        }
    }

    @Override
    public T remove(int i) {
        if (i >= 0 && i < size())
            return list.remove(i);
        else
            return null;
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return list.listIterator(i);
    }

    @Override
    public List<T> subList(int i, int i1) {
        if (i < size() && i1 < size())
            return list.subList(i, i1);
        return Collections.emptyList();
    }
}
