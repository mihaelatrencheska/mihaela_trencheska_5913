public static void main(String[] args){

        List<String> names=Arrays.asList("Kole Kolev","Ana Stojanovska","Marko Jovanovski","Elena Petrova","Ivan Nikolov");

        Random random=new Random();
        List<Student> students=names.stream().map(name->createStudent(name,"Year "+(random.nextInt(3)+1),1000+random.nextInt(9000))).collect(Collectors.toList());

        System.out.println("All Students:");
        students.forEach(Demo::print);

        List<Student> secondYearStudents=students.stream().filter(student->student.getYearOfStudy().equals("Year 2")).collect(Collectors.toList());

        System.out.println("\nStudents in their second year:");
        secondYearStudents.forEach(Demo::print);
        }

