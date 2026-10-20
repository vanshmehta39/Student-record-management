# DSA explanation

`StudentBST` is a manual, ordinary binary search tree keyed by immutable student ID. Each node stores the student plus left/right references. `insert`, `searchById`, `deleteById`, inorder traversal, and rebuild are implemented without TreeMap/TreeSet. Deletion covers leaf, one-child, and two-child nodes; the two-child case replaces the node with its inorder successor.

The website’s numeric ID search calls `/api/students/search-by-id/{id}` and displays the actual visited-node counter and path recorded by the BST search. Search/insertion/deletion are average O(log n) for a reasonably balanced tree but worst-case O(n) because this is not self-balancing. Inorder traversal is O(n).

An `ArrayList<Student>` is used for listing, filters, sorting, dashboard snapshots and reports. Index access is O(1); search and middle removal are O(n); append is amortized O(1); sorting is typically O(n log n). MySQL is still the permanent source of truth.
