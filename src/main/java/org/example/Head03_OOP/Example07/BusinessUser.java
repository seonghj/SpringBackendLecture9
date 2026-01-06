package org.example.Head03_OOP.Example07;

class BusinessUser extends User{
    private String email;
    private String companyName;

    public BusinessUser(String id, String name, String email, String companyName){
        super(id, name);
        this.email = email;
        this.companyName = companyName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("email: " + email + ", 회사: " + companyName);
    }
}
