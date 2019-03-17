# homework
Framework for doing homework for school. Does the dumb stuff for you.

## Library API

#### Scripts and Config Files
The scripts included in this library use.

#### Language Agnostic API


#### Language-Specific Deviations
None at the moment.

## Philosophy
1. Your code shouldn't handle malformed input except when explicitly required in
   the problem text. `main` should throw, or when necessary your library should handle it for you.
2. Your code shouldn't worry about low-level performance until the *very* end. This means using
   high-precision datatypes by default
3. Your code shouldn't worry about OOP abstractions. This means no
   `public Heap extends Collections` in your code, and no `new Scanner` in your
   `main` function; i.e. the library will implement it for you.
4. Namespaces should be clear to *you*. You can refactor later, or not at all
   depending on the assignment text. More generally, your reader is you, so write
   with that in mind. If you have a mnemonic to remember something, consider using
   it directly in your code to make reading it faster. Again, you can refactor later.
5. Comments explain *why*, not *what*. Your comments show your *thought process*,
   and your code shows your *implementation*. If your code isn't clear, ask yourself
   *why isn't my code clear?* If the answer is "performance", refer to point 2.


