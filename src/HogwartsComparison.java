public class HogwartsComparison {
    public void compareGryffindor(GryffindorStudents first, GryffindorStudents second, GryffindorStudents third) {
        var firstPoints = first.getBravery() + first.getHonour() + first.getNobility();
        var secondPoints = second.getBravery() + second.getHonour() + second.getNobility();
        var thirdPoints = third.getBravery() + third.getHonour() + third.getNobility();

        if (firstPoints > secondPoints && firstPoints > thirdPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName() + " и " + third.getName());
        } else if (firstPoints < secondPoints && thirdPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName() + " и " + third.getName());
        } else if (thirdPoints > firstPoints && thirdPoints > secondPoints) {
            System.out.println("Студент " + third.getName() + " лучше чем " + first.getName() + " и " + second.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName() + " и " + third.getName() + " равны");
        }
    }

    public void compareHufflepuff(HufflepuffStudents first, HufflepuffStudents second, HufflepuffStudents third) {
        var firstPoints = first.getLoyalty() + first.getHonour() + first.getIndustriousness();
        var secondPoints = second.getLoyalty() + second.getHonour() + second.getIndustriousness();
        var thirdPoints = third.getLoyalty() + third.getHonour() + third.getIndustriousness();

        if (firstPoints > secondPoints && firstPoints > thirdPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName() + " и " + third.getName());
        } else if (firstPoints < secondPoints && thirdPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName() + " и " + third.getName());
        } else if (thirdPoints > firstPoints && thirdPoints > secondPoints) {
            System.out.println("Студент " + third.getName() + " лучше чем " + first.getName() + " и " + second.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName() + " и " + third.getName() + " равны");
        }
    }

    public void compareRavenclaw(RavenclawStudents first, RavenclawStudents second, RavenclawStudents third) {
        var firstPoints = first.getMind() + first.getWisdom() + first.getWit() + first.getCreation();
        var secondPoints = second.getMind() + second.getWisdom() + second.getWit() + second.getCreation();
        var thirdPoints = third.getMind() + third.getWisdom() + third.getWit() + third.getCreation();

        if (firstPoints > secondPoints && firstPoints > thirdPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName() + " и " + third.getName());
        } else if (firstPoints < secondPoints && thirdPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName() + " и " + third.getName());
        } else if (thirdPoints > firstPoints && thirdPoints > secondPoints) {
            System.out.println("Студент " + third.getName() + " лучше чем " + first.getName() + " и " + second.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName() + " и " + third.getName() + " равны");
        }
    }

    public void compareSlytherin(SlytherinStudents first, SlytherinStudents second, SlytherinStudents third) {
        var firstPoints = first.getTrick() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getPower();
        var secondPoints = second.getTrick() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getPower();
        var thirdPoints = third.getTrick() + third.getDetermination() + third.getAmbition() + third.getResourcefulness() + third.getPower();

        if (firstPoints > secondPoints && firstPoints > thirdPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName() + " и " + third.getName());
        } else if (firstPoints < secondPoints && thirdPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName() + " и " + third.getName());
        } else if (thirdPoints > firstPoints && thirdPoints > secondPoints) {
            System.out.println("Студент " + third.getName() + " лучше чем " + first.getName() + " и " + second.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName() + " и " + third.getName() + " равны");
        }
    }

    public void compareAnyStudent(HogwartsStudents first, HogwartsStudents second){
        var firstPoints = first.getMagic() + first.getTransgression();
        var secondPoints = second.getMagic() + second.getTransgression();

        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println("Студенты " + second.getName() + " , " + first.getName());
        }
    }
}

