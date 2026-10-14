# Category C — Encapsulation and Data Privacy

Beginner-friendly Java solutions for the five provided practice problems.

## Programs
1. `PiggyBank.java` — private savings, deposit and withdrawal methods, final ID.
2. `QuizScorecard.java` — private answer array and score-only access.
3. `NameTag.java` — immutable name parts and nickname creation.
4. `Locker.java` — private combination code and verified code changes.
5. `AttendanceSheet.java` — private fixed-size array, duplicate prevention, count and name lookup.

## Compile and run
Install a Java JDK, open a terminal in this folder, then run one program at a time. Example:

```text
javac PiggyBank.java
java PiggyBank
```

Use the corresponding filename and class name for the other programs.

## Complexity
- PiggyBank actions: O(1) time and O(1) extra space.
- QuizScorecard score: O(q) time, where q is the number of recorded answers.
- NameTag nickname lookup: O(1) after construction.
- Locker code change: O(1) time.
- AttendanceSheet lookup: O(n) time in the maximum class size; marking present also checks for duplicates.
