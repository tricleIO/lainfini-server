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
 * Useremailhistory
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Useremailhistory   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Date$DATE")
  private DateTime dateDATE = null;

  @SerializedName("User_ID")
  private String userID = null;

  @SerializedName("Email")
  private String email = null;

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

  public Useremailhistory dateDATE(DateTime dateDATE) {
    this.dateDATE = dateDATE;
    return this;
  }

   /**
   * Datum použití [persistentní položka]
   * @return dateDATE
  **/
  @ApiModelProperty(example = "null", value = "Datum použití [persistentní položka]")
  public DateTime getDateDATE() {
    return dateDATE;
  }

  public void setDateDATE(DateTime dateDATE) {
    this.dateDATE = dateDATE;
  }

  public Useremailhistory userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Osoba; ID objektu Uživatel [persistentní položka]
   * @return userID
  **/
  @ApiModelProperty(example = "null", value = "Osoba; ID objektu Uživatel [persistentní položka]")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public Useremailhistory email(String email) {
    this.email = email;
    return this;
  }

   /**
   * E-mail [persistentní položka]
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "E-mail [persistentní položka]")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Useremailhistory useremailhistory = (Useremailhistory) o;
    return Objects.equals(this.displayName, useremailhistory.displayName) &&
        Objects.equals(this.ID, useremailhistory.ID) &&
        Objects.equals(this.classID, useremailhistory.classID) &&
        Objects.equals(this.objVersion, useremailhistory.objVersion) &&
        Objects.equals(this.dateDATE, useremailhistory.dateDATE) &&
        Objects.equals(this.userID, useremailhistory.userID) &&
        Objects.equals(this.email, useremailhistory.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, dateDATE, userID, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Useremailhistory {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    dateDATE: ").append(toIndentedString(dateDATE)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

