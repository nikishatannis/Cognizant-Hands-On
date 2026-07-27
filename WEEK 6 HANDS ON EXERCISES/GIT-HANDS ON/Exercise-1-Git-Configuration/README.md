# Exercise 1 – Git Configuration

## Objective
Configure Git with username and email, initialize a repository, and create the first commit.

## Commands Used

```bash
git --version
git config --global user.name "username"
git config --global user.email "username@cognizant.com"

git init GitDemo
cd GitDemo

echo "Welcome to the version control" > welcome.txt

git status
git add welcome.txt
git commit -m "Added welcome text"
git status
```

## Result

Git was configured successfully and the initial commit was created.
