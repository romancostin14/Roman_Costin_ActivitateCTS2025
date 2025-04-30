package v2_composite.program;

import v2_composite.clase.Director;
import v2_composite.clase.Fisier;

public class Main {
    public static void main(String[] args) {
        Director myDocuments = new Director("My Documents");
        Director musicDirectory = new Director("Music");
        Director pictureDirectory = new Director("Pictures");
        Director learningDirectory = new Director("Learning");
        musicDirectory.adauga(new Fisier("Anyma - pictures of you.mp3"));
        musicDirectory.adauga(new Fisier("Rihanna - Umbrella.mp3"));
        musicDirectory.adauga(new Fisier("Ne-yo - Miss independent.mp3"));
        pictureDirectory.adauga(new Fisier("Picture1.jpg"));
        pictureDirectory.adauga(new Fisier("Picture2.jpg"));
        pictureDirectory.adauga(new Fisier("Picture3.jpg"));
        learningDirectory.adauga(new Fisier("Curs1.pptx"));
        learningDirectory.adauga(new Fisier("Curs2.pptx"));
        learningDirectory.adauga(new Fisier("Curs3.pptx"));
        learningDirectory.adauga(new Fisier("Curs4.pptx"));

        myDocuments.adauga(musicDirectory);
        myDocuments.adauga(pictureDirectory);
        myDocuments.adauga(learningDirectory);
        myDocuments.afiseaza("");
    }
}
