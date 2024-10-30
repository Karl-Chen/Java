## 第一堂課的筆記
main 程式進入點，而且一定會是static，static是靜態方法<br>
throws是catch Exception用的，跳出例外<br>
Java Environment的核心組件,提供編譯、調試和執行Java程序所需的所有工具,可執行文件和二進製文件。<br>
static的變數，在class沒被new出來也可以被讀寫，而且只有一份，就算該class 被new再多個出來，都是取同一個static變數<br>


## 編譯指令: 只針對原始檔(.java)產生編譯檔(.class) <需在該專案目錄下執行>
$ `javac App.java` 

## 執行指令: 可直接執行原始檔(.java)或是編譯檔(.class)
### 執行原始碼
$ `java App.java`   

### 執行編譯檔 <需在該專案目錄下執行>
$ `java App`

### 執行編譯檔 <在非專案下執行>(需用 -cp: 啟動 JVM 時告知可執行檔（.class）的位置)
$ `java -cp c:\Java\2410\FirstLesson\bin App`

### 執行jar檔 <需在該專案目錄下執行>
$ `java -jar FirstLesson.jar`