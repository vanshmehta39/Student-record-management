# Viva questions and concise answers

1. **Why use MySQL?** It gives permanent, relational storage with a unique email constraint.
2. **Why a BST too?** It demonstrates an in-memory ID-search structure; it does not replace persistence.
3. **BST search complexity?** O(h); average O(log n), worst O(n) for an unbalanced BST.
4. **How is a two-child BST node deleted?** It is replaced with its inorder successor, then the successor is deleted.
5. **What is the search metric?** The number of nodes actually inspected by the loop.
6. **Why ArrayList?** It is simple and efficient for ordered listing, reports and sorting.
7. **How are duplicate emails stopped?** Backend validation checks first and the database unique constraint enforces it finally.
8. **What happens at startup?** Records load from MySQL into the ArrayList and BST.
9. **What updates collections?** Only after a database save/delete succeeds.
10. **Why is ID immutable?** It is the database primary key and BST comparison key.
11. **How is frontend/backend communication done?** Vanilla `fetch()` calls REST endpoints returning JSON.
12. **How are values validated?** HTML constraints provide immediate feedback and Jakarta validation protects the API.
13. **How is CSV made safe?** Every value is quoted and embedded quotes are doubled.
14. **Why no login?** It is explicitly a focused local administrator classroom project.
15. **What source is authoritative?** MySQL; the BST and ArrayList are rebuilding caches for application use.
