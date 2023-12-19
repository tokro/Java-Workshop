<h1 align="center">Java-Grundlagen-Workshop</h1>
<h3 align="center">Kostenlose Beispielaufgaben zum Einstieg in Java</h3>

---

[![en](https://img.shields.io/badge/lang-en-blue.svg)](https://github.com/tokro/Java-Workshop/blob/main/README.MD)
[![de](https://img.shields.io/badge/lang-de-red.svg)](https://github.com/tokro/Java-Workshop/blob/main/README.de.MD)

Dies ist ein GitHub-Repository mit Übungen für einen Java-Grundlagen-Workshop.
Das Repository ist in mehrere Ordner unterteilt, die Übungen zu verschiedenen Themen enthalten.
Die Java-Datei mit dem Namen des Themas (z. B. Operators.java) enthält Beispiele zur Referenz.<br>
Darüber hinaus gibt es Dateien mit den Anhängen _task und _solution. Die Task-Datei enthält eine Aufgabe mit Übungen zum jeweiligen Thema.<br>
Die Solution-Datei enthält eine entsprechende Lösung.
Es sollte beachtet werden, dass dies nur Musterlösungen sind, da es verschiedene Möglichkeiten gibt, das Problem zu lösen.

# Inhalt

Dieses Projekt enthält mehrere Themen mit Java-Code zu Lernzwecken.

| Nr | Thema                                                                                                                                                                  |
|:--:|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/01_HelloWorld">Hello World</a>                                     |
| 2  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/02_Operators">Operatoren</a>                                       |
| 3  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/03_ControlStructures">Kontrollstrukturen</a>                       |
| 4  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/04_Arrays">Arrays</a>                                              |
| 5  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/05_InputOutput">Eingabe & Ausgabe</a>                              |
| 6  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/06_Methods">Methoden</a>                                           |
| 7  | <a target="_blank" rel="noopener noreferrer" href="https://github.com/tokro/Java-Workshop/tree/main/07_ObjectOrientedProgramming">Objektorientierte Programmierung</a> |

---

# Erste Schritte

## Installation des Java Development Kit (JDK)

Das Java Development Kit kombiniert Entwicklungstools, Bibliotheken, die Java Runtime Environment (JRE) und die Java Virtual Machine (JVM).

### Download

Sie können das JDK von der <a target="_blank" rel="noopener noreferrer" href="https://www.oracle.com/java/technologies/downloads/#java21">offiziellen Oracle-Website</a> oder direkt über die folgenden Links herunterladen (JDK 21).

<details>
  <summary>Windows</summary>
  
  - [x64 Installer](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe.sha256))
  - [x64 MSI Installer](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.msi) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.msi.sha256))
</details>

<details>
 <summary>macOS</summary>

 - [Intel](https://download.oracle.com/java/21/latest/jdk-21_macos-x64_bin.dmg) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_macos-x64_bin.dmg.sha256))
 - [Apple Silicon (M)](https://download.oracle.com/java/21/latest/jdk-21_macos-aarch64_bin.dmg) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_macos-aarch64_bin.dmg.sha256))
</details>

<details>
 <summary>Linux</summary>

 - [ARM64 Compressed Archive](https://download.oracle.com/java/21/latest/jdk-21_linux-aarch64_bin.tar.gz) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_linux-aarch64_bin.tar.gz.sha256))
 - [ARM64 RPM Package](https://download.oracle.com/java/17/latest/jdk-17_linux-aarch64_bin.rpm) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_linux-aarch64_bin.rpm.sha256)) ([OL 8 GPG Key](https://linux.oracle.com/security/gpg/))
 - [x64 Compressed Archive](https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.tar.gz) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.tar.gz.sha256))
 - [x64 Debian Package](https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.deb) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.deb.sha256))
 - [x64 RPM Package](https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm) ([sha256](https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.rpm.sha256)) ([OL 8 GPG Key](https://linux.oracle.com/security/gpg/))
</details>

## .java-Dateien in der Eingabeaufforderung / im Terminal kompilieren und ausführen

Dieses Tutorial führt Sie durch den Prozess des Kompilierens und Ausführens von Java-Programmen unter Verwendung der Eingabeaufforderung / des Terminals.

### Schritt 1: Eingabeaufforderung / Terminal öffnen

- <b>Windows:</b> Drücken Sie `Win + R`, geben Sie `cmd` ein und drücken Sie Enter, um die Eingabeaufforderung zu öffnen.
- <b>macOS:</b> Sie können das Terminal über Spotlight öffnen (drücken Sie `Cmd + Leertaste` und beginnen Sie mit der Eingabe von "Terminal") oder indem Sie zu `Anwendungen -> Dienstprogramme -> Terminal` navigieren.
- <b>Linux:</b> Sie können das Terminal öffnen, indem Sie danach suchen oder den Tastenkürzel `Strg + Alt + T` verwenden.

### Schritt 2: Zum Verzeichnis navigieren
Verwenden Sie den Befehl `cd`, um zum Verzeichnis zu navigieren, in dem Ihre .java-Datei liegt. Zum Beispiel:

```shell
cd Pfad\zu\Ihrem\Java\Dateiverzeichnis
```

Ersetzen Sie `Pfad\zu\Ihrem\Java\Dateiverzeichnis` durch den tatsächlichen Pfad zum Verzeichnis Ihrer Java-Datei.

### Schritt 3: Kompilieren der Java-Datei
Um die Java-Datei zu kompilieren, verwenden Sie den Befehl `javac`, gefolgt vom Dateinamen mit der Erweiterung `.java`. Verwenden Sie für unser Beispiel:

```shell
javac HelloWorld.java
```

Wenn es keine Fehler in Ihrem Code gibt, wird dieser Befehl eine HelloWorld.class-Datei im gleichen Verzeichnis erstellen.

### Schritt 4: Ausführen des Java-Programms
Um das kompilierte Java-Programm auszuführen, verwenden Sie den Befehl `java`, gefolgt vom Namen der Klasse, die die `main`-Methode enthält (ohne die Erweiterung `.class`). Verwenden Sie für unser Beispiel:

```shell
java HelloWorld
```

Sie sollten die Ausgabe auf dem Bildschirm sehen:

```shell
Hello, World!
```

# Fehlerbehebung
- Wenn Sie während der Kompilierung Fehler feststellen, überprüfen Sie Ihren Code auf Syntaxfehler und stellen Sie sicher, dass Ihr JDK korrekt installiert ist.
- Stellen Sie sicher, dass Ihre Eingabeaufforderung / Ihr Terminal die richtige Java-Version verwendet. Sie können die Java-Version mit `java -version` überprüfen.
- Stellen Sie sicher, dass Sie sich im richtigen Verzeichnis befinden, wenn Sie Ihr Java-Programm kompilieren und ausführen. Verwenden Sie den Befehl `cd`, um zum richtigen Verzeichnis zu navigieren.

---

<p align="center">
Author:<br>
<a href="https://github.com/tokro">tokro</a>
</p>
