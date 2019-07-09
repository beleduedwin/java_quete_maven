package fr.wildcodeschool.quetes.maven;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class TestDep {

  public static final String WCS = "Wild Code School";
  public static final String WWW = "Wild Wild West";

  public static void main(String[] args) {
    Integer distance = LevenshteinDistance.getDefaultInstance().apply(WCS, WWW);
    System.out.printf("The distance between %s and %s is %d%n", WCS, WWW, distance);
  }

}
