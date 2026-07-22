// Insertion – Adding a Track to a Playlist Queue
class Solution {

    public void insertAfter(Node current, int trackId) {

        if (current == null)
            return;

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }
}