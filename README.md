# Java_module

## Java 정리
---
### 1. Visual Studio Code에 Java 시작하기 (자바 설정, 프로젝트 생성 및 실행)
#### 1. VS Code 설치
#### 2. JDK 설치
#### 3. VSCode -> Extensions(Ctrl + Shift + X) -> Java Extension Pack 검색 -> Install 
- Java Extension Pack을 설치하면 아래 Extenstion이 설치 된다
    - Language Support for Java By Red Hat
    - Debugger for Java
    - Java Test Runner
    - Maven for Java
    - Java Dependency Viewer
    - Visual Studio IntelliCode
#### 4. 자바 Configure 확인
- 커맨드 팔레트 (Ctrl + Shift + P) -> Java: Configure Java Runtime

- JDK Path를 확인한다
#### 5. 자바 프로그램 만들기
- Java Extension Pack을 설치하면 VSCode를 이용해서 Java 프로젝트를 만드는 방법을 제공
- 커맨드 팔레트 (Ctrl + Shift + P) -> Java: Getting Started

    1) 폴더 만들기
    Open Folder -> 새로 만들기 -> 폴더 선택
    2) 새파일 만들기
    우클릭 -> 새 파일 만들기 또는 새 파일 만들기 아이콘 클릭
    3) Hello World 작성 및 실행
    ```
    public class Hello {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }
    }
    ```
- Run 또는 Debug 버튼 클릭
    단축키]
    Run : F5, Ctrl + F5
    Debug : Ctrl + F11  