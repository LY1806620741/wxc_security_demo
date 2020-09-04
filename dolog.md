 删除无用二进制 `git filter-branch -f --prune-empty --index-filter 'git rm -rf --cached --ignore-unmatch .mvn/wrapper' --tag-name-filter cat -- --all`
 添加.gitattributes修改默认语言
 转换maven项目为gradle `gradle.bat init --type pom`