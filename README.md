# Hackerrank

This is the repository to store all the solutions of the problems I did on the Hackerrank website. Keep working hard, you got this!

[My Hackerrank profile](https://www.hackerrank.com/SodaNYC)

### Q&A
* When I use git command to upload my new files to this repository, the .idea folders got uploaded as well, how can I delete them?
  1. Add .idea directory to the list of ignored files
      ```
      $ echo '.idea' >> .gitignore
      ```
  2. Remove the directory only from the repository
      ```
      $ git rm -r --cached .idea
      ```
  3. Send the change forward
      ```
      $ git add .gitignore
      $ git commit -m 'untracking .idea'
      $ git push origin master
      ```
* How to prevent git from uploading .iml files into the repository?
  1. Add *.iml directory to the list of ignored files
      ```
      $ echo '*.iml' >> .gitignore
      ```
  2. Remove the directory only from the repository
      ```
      $ git rm -r --cached *.iml
      ```
  3. Send the change forward
      ```
      $ git add .gitignore
      $ git commit -m 'untracking .iml'
      $ git push origin master
      ```
