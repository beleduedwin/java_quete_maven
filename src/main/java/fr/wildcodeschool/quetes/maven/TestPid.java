package fr.wildcodeschool.quetes.maven;

public class TestPid {

  public static void main(String[] args) {

    long pid = ProcessHandle.current().pid();
    System.out.printf("PID du programme: %d%n", pid);
  }
}
