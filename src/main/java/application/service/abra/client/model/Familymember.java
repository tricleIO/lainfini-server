/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.Objects;


/**
 * Familymember
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Familymember   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Parent_ID")
  private String parentID = null;

  @SerializedName("LastName")
  private String lastName = null;

  @SerializedName("FirstName")
  private String firstName = null;

  @SerializedName("BirthNumber")
  private String birthNumber = null;

  @SerializedName("FamilyRelationType")
  private Integer familyRelationType = null;

  @SerializedName("CountOffType_ID")
  private String countOffTypeID = null;

  @SerializedName("ValidFrom_ID")
  private String validFromID = null;

  @SerializedName("ValidTo_ID")
  private String validToID = null;

  @SerializedName("DateOfBirth$DATE")
  private DateTime dateOfBirthDATE = null;

  @SerializedName("Age")
  private Integer age = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

   /**
   * Vlastník; ID objektu Hlavičkový objekt [persistentní položka]
   * @return parentID
  **/
  @ApiModelProperty(example = "null", value = "Vlastník; ID objektu Hlavičkový objekt [persistentní položka]")
  public String getParentID() {
    return parentID;
  }

  public Familymember lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Příjmení [persistentní položka]
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Příjmení [persistentní položka]")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Familymember firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Křestní jméno [persistentní položka]
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "Křestní jméno [persistentní položka]")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Familymember birthNumber(String birthNumber) {
    this.birthNumber = birthNumber;
    return this;
  }

   /**
   * Rodné číslo [persistentní položka]
   * @return birthNumber
  **/
  @ApiModelProperty(example = "null", value = "Rodné číslo [persistentní položka]")
  public String getBirthNumber() {
    return birthNumber;
  }

  public void setBirthNumber(String birthNumber) {
    this.birthNumber = birthNumber;
  }

  public Familymember familyRelationType(Integer familyRelationType) {
    this.familyRelationType = familyRelationType;
    return this;
  }

   /**
   * Vztah [persistentní položka]
   * @return familyRelationType
  **/
  @ApiModelProperty(example = "null", value = "Vztah [persistentní položka]")
  public Integer getFamilyRelationType() {
    return familyRelationType;
  }

  public void setFamilyRelationType(Integer familyRelationType) {
    this.familyRelationType = familyRelationType;
  }

  public Familymember countOffTypeID(String countOffTypeID) {
    this.countOffTypeID = countOffTypeID;
    return this;
  }

   /**
   * Odpočet; ID objektu Typ odpočtu/slevy [persistentní položka]
   * @return countOffTypeID
  **/
  @ApiModelProperty(example = "null", value = "Odpočet; ID objektu Typ odpočtu/slevy [persistentní položka]")
  public String getCountOffTypeID() {
    return countOffTypeID;
  }

  public void setCountOffTypeID(String countOffTypeID) {
    this.countOffTypeID = countOffTypeID;
  }

  public Familymember validFromID(String validFromID) {
    this.validFromID = validFromID;
    return this;
  }

   /**
   * Platí od; ID objektu Mzdové období [persistentní položka]
   * @return validFromID
  **/
  @ApiModelProperty(example = "null", value = "Platí od; ID objektu Mzdové období [persistentní položka]")
  public String getValidFromID() {
    return validFromID;
  }

  public void setValidFromID(String validFromID) {
    this.validFromID = validFromID;
  }

  public Familymember validToID(String validToID) {
    this.validToID = validToID;
    return this;
  }

   /**
   * Platí do; ID objektu Mzdové období [persistentní položka]
   * @return validToID
  **/
  @ApiModelProperty(example = "null", value = "Platí do; ID objektu Mzdové období [persistentní položka]")
  public String getValidToID() {
    return validToID;
  }

  public void setValidToID(String validToID) {
    this.validToID = validToID;
  }

  public Familymember dateOfBirthDATE(DateTime dateOfBirthDATE) {
    this.dateOfBirthDATE = dateOfBirthDATE;
    return this;
  }

   /**
   * Datum narození [persistentní položka]
   * @return dateOfBirthDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum narození [persistentní položka]")
  public DateTime getDateOfBirthDATE() {
    return dateOfBirthDATE;
  }

  public void setDateOfBirthDATE(DateTime dateOfBirthDATE) {
    this.dateOfBirthDATE = dateOfBirthDATE;
  }

   /**
   * Věk
   * @return age
  **/
  @ApiModelProperty(example = "null", value = "Věk")
  public Integer getAge() {
    return age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Familymember familymember = (Familymember) o;
    return Objects.equals(this.displayName, familymember.displayName) &&
        Objects.equals(this.ID, familymember.ID) &&
        Objects.equals(this.classID, familymember.classID) &&
        Objects.equals(this.objVersion, familymember.objVersion) &&
        Objects.equals(this.parentID, familymember.parentID) &&
        Objects.equals(this.lastName, familymember.lastName) &&
        Objects.equals(this.firstName, familymember.firstName) &&
        Objects.equals(this.birthNumber, familymember.birthNumber) &&
        Objects.equals(this.familyRelationType, familymember.familyRelationType) &&
        Objects.equals(this.countOffTypeID, familymember.countOffTypeID) &&
        Objects.equals(this.validFromID, familymember.validFromID) &&
        Objects.equals(this.validToID, familymember.validToID) &&
        Objects.equals(this.dateOfBirthDATE, familymember.dateOfBirthDATE) &&
        Objects.equals(this.age, familymember.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, parentID, lastName, firstName, birthNumber, familyRelationType, countOffTypeID, validFromID, validToID, dateOfBirthDATE, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Familymember {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    birthNumber: ").append(toIndentedString(birthNumber)).append("\n");
    sb.append("    familyRelationType: ").append(toIndentedString(familyRelationType)).append("\n");
    sb.append("    countOffTypeID: ").append(toIndentedString(countOffTypeID)).append("\n");
    sb.append("    validFromID: ").append(toIndentedString(validFromID)).append("\n");
    sb.append("    validToID: ").append(toIndentedString(validToID)).append("\n");
    sb.append("    dateOfBirthDATE: ").append(toIndentedString(dateOfBirthDATE)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

