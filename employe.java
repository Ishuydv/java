class employe1 {
    int id;
    String name,email,city,state;
    

    employe1(int id, String name, String email, String city, String state){
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
        
    }

    void display(){
        System.out.println("emploe id : "+this.id);
        System.out.println("emploe name : "+this.name);
        System.out.println("emploe email : "+this.email);
        System.out.println("emploe city : "+this.city);
        System.out.println("emploe state : "+this.state);
    }

}

class employe {
    public static void main(String[] args) {

        employe1 e = new employe1(012, "ishu", "ishuyadav@gmail.com", "Rewari", "Haryana");
        e.display();
        
    }
}
