/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.github;

/**
 *
 * @author Lihle Langa
 */
public class Cattle{
private String cattlename, breed;

public String getCattleName(){
return cattlename;
}
public void setCattleName(String CattleName){
this.cattlename = CattleName;
}
public String getBreed(){
return breed;
}
public void setBreed(String Breed){
this.breed = Breed;
}
@Override
public String toString(){
return "CattleBarron {" + "Cattle Name: " + cattlename + " Breed: " + breed "}";
}
}
public class CattleBarron {

}
