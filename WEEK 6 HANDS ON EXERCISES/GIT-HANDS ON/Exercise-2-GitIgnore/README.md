# Exercise 2 – Git Ignore

## Objective

Ignore log files and log folders using `.gitignore`.

## Commands Used

```bash
echo "log" > test.log

mkdir log_folder

echo "log inside folder" > log_folder/test.log

echo "*.log" >> .gitignore

echo "log_folder/" >> .gitignore

git add .gitignore

git commit -m "Update gitignore for log files and log folders"

git status
```

## Result

Git ignored all log files and the log folder successfully.
