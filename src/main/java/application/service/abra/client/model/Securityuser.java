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

import java.util.Objects;


/**
 * Securityuser
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Securityuser   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("ShortName")
  private String shortName = null;

  @SerializedName("Note")
  private String note = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Address_ID")
  private Securityuser addressID = null;

  @SerializedName("LoginName")
  private String loginName = null;

  @SerializedName("Locked")
  private Boolean locked = null;

  @SerializedName("SecPassword")
  private String secPassword = null;

  @SerializedName("IsActive")
  private Boolean isActive = null;

  @SerializedName("LogonPassword")
  private String logonPassword = null;

  @SerializedName("PortalLoginName")
  private String portalLoginName = null;

  @SerializedName("PortalSecPassword")
  private String portalSecPassword = null;

  @SerializedName("OfferToLogin")
  private Boolean offerToLogin = null;

  @SerializedName("WebAPIAccess")
  private Boolean webAPIAccess = null;

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

  public Securityuser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Jméno [persistentní položka]
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Jméno [persistentní položka]")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Securityuser shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Zkratka [persistentní položka]
   * @return shortName
  **/
  @ApiModelProperty(example = "null", value = "Zkratka [persistentní položka]")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Securityuser note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Securityuser comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Poznámka
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "Poznámka")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Securityuser addressID(Securityuser addressID) {
    this.addressID = addressID;
    return this;
  }

   /**
   * Get addressID
   * @return addressID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Securityuser getAddressID() {
    return addressID;
  }

  public void setAddressID(Securityuser addressID) {
    this.addressID = addressID;
  }

  public Securityuser loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

   /**
   * Přihlašovací jméno [persistentní položka]
   * @return loginName
  **/
  @ApiModelProperty(example = "null", value = "Přihlašovací jméno [persistentní položka]")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public Securityuser locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Uzamčen [persistentní položka]
   * @return locked
  **/
  @ApiModelProperty(example = "null", value = "Uzamčen [persistentní položka]")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Securityuser secPassword(String secPassword) {
    this.secPassword = secPassword;
    return this;
  }

   /**
   * Heslo [persistentní položka]
   * @return secPassword
  **/
  @ApiModelProperty(example = "null", value = "Heslo [persistentní položka]")
  public String getSecPassword() {
    return secPassword;
  }

  public void setSecPassword(String secPassword) {
    this.secPassword = secPassword;
  }

  public Securityuser isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Aktivní
   * @return isActive
  **/
  @ApiModelProperty(example = "null", value = "Aktivní")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Securityuser logonPassword(String logonPassword) {
    this.logonPassword = logonPassword;
    return this;
  }

   /**
   * Heslo
   * @return logonPassword
  **/
  @ApiModelProperty(example = "null", value = "Heslo")
  public String getLogonPassword() {
    return logonPassword;
  }

  public void setLogonPassword(String logonPassword) {
    this.logonPassword = logonPassword;
  }

  public Securityuser portalLoginName(String portalLoginName) {
    this.portalLoginName = portalLoginName;
    return this;
  }

   /**
   * Přihlašovací jméno  [persistentní položka]
   * @return portalLoginName
  **/
  @ApiModelProperty(example = "null", value = "Přihlašovací jméno  [persistentní položka]")
  public String getPortalLoginName() {
    return portalLoginName;
  }

  public void setPortalLoginName(String portalLoginName) {
    this.portalLoginName = portalLoginName;
  }

  public Securityuser portalSecPassword(String portalSecPassword) {
    this.portalSecPassword = portalSecPassword;
    return this;
  }

   /**
   * Heslo [persistentní položka]
   * @return portalSecPassword
  **/
  @ApiModelProperty(example = "null", value = "Heslo [persistentní položka]")
  public String getPortalSecPassword() {
    return portalSecPassword;
  }

  public void setPortalSecPassword(String portalSecPassword) {
    this.portalSecPassword = portalSecPassword;
  }

  public Securityuser offerToLogin(Boolean offerToLogin) {
    this.offerToLogin = offerToLogin;
    return this;
  }

   /**
   * Nabízet v přihlašovacím okně [persistentní položka]
   * @return offerToLogin
  **/
  @ApiModelProperty(example = "null", value = "Nabízet v přihlašovacím okně [persistentní položka]")
  public Boolean getOfferToLogin() {
    return offerToLogin;
  }

  public void setOfferToLogin(Boolean offerToLogin) {
    this.offerToLogin = offerToLogin;
  }

  public Securityuser webAPIAccess(Boolean webAPIAccess) {
    this.webAPIAccess = webAPIAccess;
    return this;
  }

   /**
   * Přihlášení nevizuálního uživatele API [persistentní položka]
   * @return webAPIAccess
  **/
  @ApiModelProperty(example = "null", value = "Přihlášení nevizuálního uživatele API [persistentní položka]")
  public Boolean getWebAPIAccess() {
    return webAPIAccess;
  }

  public void setWebAPIAccess(Boolean webAPIAccess) {
    this.webAPIAccess = webAPIAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Securityuser securityuser = (Securityuser) o;
    return Objects.equals(this.displayName, securityuser.displayName) &&
        Objects.equals(this.ID, securityuser.ID) &&
        Objects.equals(this.classID, securityuser.classID) &&
        Objects.equals(this.objVersion, securityuser.objVersion) &&
        Objects.equals(this.name, securityuser.name) &&
        Objects.equals(this.shortName, securityuser.shortName) &&
        Objects.equals(this.note, securityuser.note) &&
        Objects.equals(this.comment, securityuser.comment) &&
        Objects.equals(this.addressID, securityuser.addressID) &&
        Objects.equals(this.loginName, securityuser.loginName) &&
        Objects.equals(this.locked, securityuser.locked) &&
        Objects.equals(this.secPassword, securityuser.secPassword) &&
        Objects.equals(this.isActive, securityuser.isActive) &&
        Objects.equals(this.logonPassword, securityuser.logonPassword) &&
        Objects.equals(this.portalLoginName, securityuser.portalLoginName) &&
        Objects.equals(this.portalSecPassword, securityuser.portalSecPassword) &&
        Objects.equals(this.offerToLogin, securityuser.offerToLogin) &&
        Objects.equals(this.webAPIAccess, securityuser.webAPIAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, name, shortName, note, comment, addressID, loginName, locked, secPassword, isActive, logonPassword, portalLoginName, portalSecPassword, offerToLogin, webAPIAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Securityuser {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    addressID: ").append(toIndentedString(addressID)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    secPassword: ").append(toIndentedString(secPassword)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    logonPassword: ").append(toIndentedString(logonPassword)).append("\n");
    sb.append("    portalLoginName: ").append(toIndentedString(portalLoginName)).append("\n");
    sb.append("    portalSecPassword: ").append(toIndentedString(portalSecPassword)).append("\n");
    sb.append("    offerToLogin: ").append(toIndentedString(offerToLogin)).append("\n");
    sb.append("    webAPIAccess: ").append(toIndentedString(webAPIAccess)).append("\n");
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

