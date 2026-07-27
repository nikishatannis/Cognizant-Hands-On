# Exercise 3 – Branching & Merging

## Objective

Create a new branch, perform changes, and merge it back into the master/main branch.

## Commands Used

```bash
git branch GitNewBranch

git checkout GitNewBranch

echo "new feature" > newfile.txt

git add newfile.txt

git commit -m "Add newfile.txt in GitNewBranch"

git checkout master

git merge GitNewBranch

git branch -d GitNewBranch

git status
```

## Result

The feature branch was merged successfully into the master branch.
