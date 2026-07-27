# Exercise 4 – Merge Conflict Resolution

## Objective

Create a merge conflict and resolve it manually.

## Commands Used

```bash
git checkout -b GitWork

echo "<hello>GitWork</hello>" > hello.xml

git add hello.xml

git commit -m "Add hello.xml in GitWork"

git checkout master

echo "<hello>master</hello>" > hello.xml

git add hello.xml

git commit -m "Add hello.xml in master"

git merge GitWork

# Resolve conflict manually

echo "<hello>resolved</hello>" > hello.xml

git add hello.xml

git commit -m "Resolve merge conflict"

git branch -d GitWork
```

## Result

Merge conflict was resolved successfully.
