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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Issuedoffertype
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Issuedoffertype   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Issuedofferstatetotype> rows = new ArrayList<Issuedofferstatetotype>();

  @SerializedName("Hidden")
  private Boolean hidden = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("DefaultDocQueue_ID")
  private String defaultDocQueueID = null;

  @SerializedName("DefaultRole_ID")
  private String defaultRoleID = null;

  @SerializedName("DefaultUser_ID")
  private String defaultUserID = null;

  @SerializedName("Roles")
  private List<Issuedofferroletotype> roles = new ArrayList<Issuedofferroletotype>();

  @SerializedName("TotalDuration")
  private DateTime totalDuration = null;

  @SerializedName("IsShorteningTerms")
  private Boolean isShorteningTerms = null;

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

  public Issuedoffertype rows(List<Issuedofferstatetotype> rows) {
    this.rows = rows;
    return this;
  }

  public Issuedoffertype addRowsItem(Issuedofferstatetotype rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Možné stavy; kolekce BO Typ nabídky - možný stav [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Možné stavy; kolekce BO Typ nabídky - možný stav [nepersistentní položka]")
  public List<Issuedofferstatetotype> getRows() {
    return rows;
  }

  public void setRows(List<Issuedofferstatetotype> rows) {
    this.rows = rows;
  }

  public Issuedoffertype hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Skrytý [persistentní položka]
   * @return hidden
  **/
  @ApiModelProperty(example = "null", value = "Skrytý [persistentní položka]")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Issuedoffertype code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Kód [persistentní položka]
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Kód [persistentní položka]")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Issuedoffertype name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Název [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Název [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Issuedoffertype defaultDocQueueID(String defaultDocQueueID) {
    this.defaultDocQueueID = defaultDocQueueID;
    return this;
  }

   /**
   * Výchozí řada dokladů; ID objektu Řada dokladů [persistentní položka]
   * @return defaultDocQueueID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí řada dokladů; ID objektu Řada dokladů [persistentní položka]")
  public String getDefaultDocQueueID() {
    return defaultDocQueueID;
  }

  public void setDefaultDocQueueID(String defaultDocQueueID) {
    this.defaultDocQueueID = defaultDocQueueID;
  }

  public Issuedoffertype defaultRoleID(String defaultRoleID) {
    this.defaultRoleID = defaultRoleID;
    return this;
  }

   /**
   * Výchozí zodpovědná role řešitele; ID objektu Role [persistentní položka]
   * @return defaultRoleID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí zodpovědná role řešitele; ID objektu Role [persistentní položka]")
  public String getDefaultRoleID() {
    return defaultRoleID;
  }

  public void setDefaultRoleID(String defaultRoleID) {
    this.defaultRoleID = defaultRoleID;
  }

  public Issuedoffertype defaultUserID(String defaultUserID) {
    this.defaultUserID = defaultUserID;
    return this;
  }

   /**
   * Výchozí zodpovědný řešitel; ID objektu Uživatel [persistentní položka]
   * @return defaultUserID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí zodpovědný řešitel; ID objektu Uživatel [persistentní položka]")
  public String getDefaultUserID() {
    return defaultUserID;
  }

  public void setDefaultUserID(String defaultUserID) {
    this.defaultUserID = defaultUserID;
  }

  public Issuedoffertype roles(List<Issuedofferroletotype> roles) {
    this.roles = roles;
    return this;
  }

  public Issuedoffertype addRolesItem(Issuedofferroletotype rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Možné role řešitele nebo řešitelé; kolekce BO Typ nabídky - možná role řešitele nebo řešitel [nepersistentní položka]
   * @return roles
  **/
  @ApiModelProperty(example = "null", value = "Možné role řešitele nebo řešitelé; kolekce BO Typ nabídky - možná role řešitele nebo řešitel [nepersistentní položka]")
  public List<Issuedofferroletotype> getRoles() {
    return roles;
  }

  public void setRoles(List<Issuedofferroletotype> roles) {
    this.roles = roles;
  }

   /**
   * Celková doba trvání
   * @return totalDuration
  **/
  @ApiModelProperty(example = "null", value = "Celková doba trvání")
  public DateTime getTotalDuration() {
    return totalDuration;
  }

  public Issuedoffertype isShorteningTerms(Boolean isShorteningTerms) {
    this.isShorteningTerms = isShorteningTerms;
    return this;
  }

   /**
   * Posunout termíny v případě dřívějšího splnění [persistentní položka]
   * @return isShorteningTerms
  **/
  @ApiModelProperty(example = "null", value = "Posunout termíny v případě dřívějšího splnění [persistentní položka]")
  public Boolean getIsShorteningTerms() {
    return isShorteningTerms;
  }

  public void setIsShorteningTerms(Boolean isShorteningTerms) {
    this.isShorteningTerms = isShorteningTerms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Issuedoffertype issuedoffertype = (Issuedoffertype) o;
    return Objects.equals(this.displayName, issuedoffertype.displayName) &&
        Objects.equals(this.ID, issuedoffertype.ID) &&
        Objects.equals(this.classID, issuedoffertype.classID) &&
        Objects.equals(this.objVersion, issuedoffertype.objVersion) &&
        Objects.equals(this.rows, issuedoffertype.rows) &&
        Objects.equals(this.hidden, issuedoffertype.hidden) &&
        Objects.equals(this.code, issuedoffertype.code) &&
        Objects.equals(this.name, issuedoffertype.name) &&
        Objects.equals(this.defaultDocQueueID, issuedoffertype.defaultDocQueueID) &&
        Objects.equals(this.defaultRoleID, issuedoffertype.defaultRoleID) &&
        Objects.equals(this.defaultUserID, issuedoffertype.defaultUserID) &&
        Objects.equals(this.roles, issuedoffertype.roles) &&
        Objects.equals(this.totalDuration, issuedoffertype.totalDuration) &&
        Objects.equals(this.isShorteningTerms, issuedoffertype.isShorteningTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, hidden, code, name, defaultDocQueueID, defaultRoleID, defaultUserID, roles, totalDuration, isShorteningTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Issuedoffertype {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultDocQueueID: ").append(toIndentedString(defaultDocQueueID)).append("\n");
    sb.append("    defaultRoleID: ").append(toIndentedString(defaultRoleID)).append("\n");
    sb.append("    defaultUserID: ").append(toIndentedString(defaultUserID)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
    sb.append("    isShorteningTerms: ").append(toIndentedString(isShorteningTerms)).append("\n");
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

