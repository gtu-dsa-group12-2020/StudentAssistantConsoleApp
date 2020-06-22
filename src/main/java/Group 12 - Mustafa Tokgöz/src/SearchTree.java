/**
 * Interface for search in tree
 * @param <E> type of data
 */
public interface SearchTree<E> {
    /**
     * Inserts item where it belongs in the tree
     * @param item New item
     * @return Returns true if item is inserted; false
     * if it isn’t (already in tree)
     */
    boolean add(E item);

    /**
     * Compare target and items in tree to find target in the tree
     * @param target It is object to find in tree
     * @return Returns true if target is found in the tree
     */
    boolean contains(E target);

    /**
     * Returns a reference to the data in the node that is equal to target
     * @param target  It is object to find in tree
     * @return if target found in tree return data in the that node, if not found return null
     */
    E find(E target);

    /**
     * Removes target from tree
     * @param target It is object to find in tree
     * @return if remove is succeed return target data, otherwise return null
     */
    E delete(E target);

    /**
     * Removes target from tree
     * @param target It is object to find in tree
     * @return if remove is succeed return true, otherwise return false
     */
    boolean remove(E target);
}
