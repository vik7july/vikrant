package Selenium1;

public class GITCommand {
	// to configure author name and email to be used with commit
	// git config --global user.name "smith"
	// git config --global user.email xam@gmail.com
	// create new local repository
	// git init
	// create a working copy of local repo git clone /path/to/repo
	// add one or more file to staging git add * and git add <filename>
	// commit changes to head but not to remote repo git commit -m "commit message"
	// commit file added with git add and also commit files you have changed since
	// then git commit -a
	// send changes to master branch of remote repo, git push origin master
	// git status command list files you have changed and those u still need to add
	// or commit
	// If you haven't connected your local repository to a remote server, add the
	// server to be able to push to it: git remote add origin <server>
    // create branch and switch to it git checkout -b <branch name>
	// switch from one branch to other git checkout <branch name>
	// git branch = list all branch in repo, and tell which branch u are in
	// delete feature branch git branch -d <branch name>
	// push the branch to remote repository so other can use: git push origin <branchname>
    // push all branch to remote repo: git push --all origin
	// Delete a branch on your remote repository: git push origin :<branchname>
	// Fetch and merge changes on the remote server to your working directory: git pull
	//To merge a different branch into your active branch: git merge <branchname>
// View all the merge conflicts: git diff
	// view conflict against base file git diff --base <filename>
	// Preview changes, before merging: git diff <sourcebranch> <targetbranch>
	//After you have manually resolved any conflicts, you mark the changed file: git add <filename>
	// CommitId is the leading characters of the changeset ID, up to 10, but must be unique. Get the ID using: git log

	//If you mess up, you can replace the changes in your working tree with the last content in head: Changes already added to the index, as well as new files, will be kept   git checkout -- <filename>
// Instead, to drop all your local changes and commits, fetch the latest history from the server and point your local master branch at it, do this:  git fetch origin
//git reset --hard origin/master
	
}
