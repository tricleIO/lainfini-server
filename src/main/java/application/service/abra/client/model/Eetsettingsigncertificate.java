/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
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
 * Eetsettingsigncertificate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Eetsettingsigncertificate   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("repository")
  private Integer repository = null;

  @SerializedName("validfrom$date")
  private DateTime validfromdate = null;

  @SerializedName("validto$date")
  private DateTime validtodate = null;

  @SerializedName("certificatehash")
  private String certificatehash = null;

  @SerializedName("certificatedata")
  private byte[] certificatedata = null;

  @SerializedName("certificatepassword")
  private String certificatepassword = null;

  @SerializedName("certificateactive")
  private Boolean certificateactive = null;

  @SerializedName("certificatesize")
  private Integer certificatesize = null;

  @SerializedName("storename")
  private String storename = null;

  @SerializedName("subjectname")
  private String subjectname = null;

  @SerializedName("issuername")
  private String issuername = null;

  public Eetsettingsigncertificate displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Eetsettingsigncertificate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Eetsettingsigncertificate classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Eetsettingsigncertificate objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Eetsettingsigncertificate parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * vlastník; id objektu hlavičkový objekt [persistentní položka]
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu hlavičkový objekt [persistentní položka]")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Eetsettingsigncertificate repository(Integer repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Úložiště certifikátu [persistentní položka]
   * @return repository
  **/
  @ApiModelProperty(example = "null", value = "Úložiště certifikátu [persistentní položka]")
  public Integer getRepository() {
    return repository;
  }

  public void setRepository(Integer repository) {
    this.repository = repository;
  }

  public Eetsettingsigncertificate validfromdate(DateTime validfromdate) {
    this.validfromdate = validfromdate;
    return this;
  }

   /**
   * platný od [persistentní položka]
   * @return validfromdate
  **/
  @ApiModelProperty(example = "null", value = "platný od [persistentní položka]")
  public DateTime getValidfromdate() {
    return validfromdate;
  }

  public void setValidfromdate(DateTime validfromdate) {
    this.validfromdate = validfromdate;
  }

  public Eetsettingsigncertificate validtodate(DateTime validtodate) {
    this.validtodate = validtodate;
    return this;
  }

   /**
   * platný do [persistentní položka]
   * @return validtodate
  **/
  @ApiModelProperty(example = "null", value = "platný do [persistentní položka]")
  public DateTime getValidtodate() {
    return validtodate;
  }

  public void setValidtodate(DateTime validtodate) {
    this.validtodate = validtodate;
  }

  public Eetsettingsigncertificate certificatehash(String certificatehash) {
    this.certificatehash = certificatehash;
    return this;
  }

   /**
   * hash certifikátu [persistentní položka]
   * @return certificatehash
  **/
  @ApiModelProperty(example = "null", value = "hash certifikátu [persistentní položka]")
  public String getCertificatehash() {
    return certificatehash;
  }

  public void setCertificatehash(String certificatehash) {
    this.certificatehash = certificatehash;
  }

  public Eetsettingsigncertificate certificatedata(byte[] certificatedata) {
    this.certificatedata = certificatedata;
    return this;
  }

   /**
   * data certifikátu [persistentní položka]
   * @return certificatedata
  **/
  @ApiModelProperty(example = "null", value = "data certifikátu [persistentní položka]")
  public byte[] getCertificatedata() {
    return certificatedata;
  }

  public void setCertificatedata(byte[] certificatedata) {
    this.certificatedata = certificatedata;
  }

  public Eetsettingsigncertificate certificatepassword(String certificatepassword) {
    this.certificatepassword = certificatepassword;
    return this;
  }

   /**
   * heslo certifikátu [persistentní položka]
   * @return certificatepassword
  **/
  @ApiModelProperty(example = "null", value = "heslo certifikátu [persistentní položka]")
  public String getCertificatepassword() {
    return certificatepassword;
  }

  public void setCertificatepassword(String certificatepassword) {
    this.certificatepassword = certificatepassword;
  }

  public Eetsettingsigncertificate certificateactive(Boolean certificateactive) {
    this.certificateactive = certificateactive;
    return this;
  }

   /**
   * certifikát aktivní [persistentní položka]
   * @return certificateactive
  **/
  @ApiModelProperty(example = "null", value = "certifikát aktivní [persistentní položka]")
  public Boolean getCertificateactive() {
    return certificateactive;
  }

  public void setCertificateactive(Boolean certificateactive) {
    this.certificateactive = certificateactive;
  }

  public Eetsettingsigncertificate certificatesize(Integer certificatesize) {
    this.certificatesize = certificatesize;
    return this;
  }

   /**
   * velikost certifikátu [persistentní položka]
   * @return certificatesize
  **/
  @ApiModelProperty(example = "null", value = "velikost certifikátu [persistentní položka]")
  public Integer getCertificatesize() {
    return certificatesize;
  }

  public void setCertificatesize(Integer certificatesize) {
    this.certificatesize = certificatesize;
  }

  public Eetsettingsigncertificate storename(String storename) {
    this.storename = storename;
    return this;
  }

   /**
   * název úložiště [persistentní položka]
   * @return storename
  **/
  @ApiModelProperty(example = "null", value = "název úložiště [persistentní položka]")
  public String getStorename() {
    return storename;
  }

  public void setStorename(String storename) {
    this.storename = storename;
  }

  public Eetsettingsigncertificate subjectname(String subjectname) {
    this.subjectname = subjectname;
    return this;
  }

   /**
   * vystaveno pro [persistentní položka]
   * @return subjectname
  **/
  @ApiModelProperty(example = "null", value = "vystaveno pro [persistentní položka]")
  public String getSubjectname() {
    return subjectname;
  }

  public void setSubjectname(String subjectname) {
    this.subjectname = subjectname;
  }

  public Eetsettingsigncertificate issuername(String issuername) {
    this.issuername = issuername;
    return this;
  }

   /**
   * vystavil [persistentní položka]
   * @return issuername
  **/
  @ApiModelProperty(example = "null", value = "vystavil [persistentní položka]")
  public String getIssuername() {
    return issuername;
  }

  public void setIssuername(String issuername) {
    this.issuername = issuername;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eetsettingsigncertificate eetsettingsigncertificate = (Eetsettingsigncertificate) o;
    return Objects.equals(this.displayname, eetsettingsigncertificate.displayname) &&
        Objects.equals(this.id, eetsettingsigncertificate.id) &&
        Objects.equals(this.classid, eetsettingsigncertificate.classid) &&
        Objects.equals(this.objversion, eetsettingsigncertificate.objversion) &&
        Objects.equals(this.parentId, eetsettingsigncertificate.parentId) &&
        Objects.equals(this.repository, eetsettingsigncertificate.repository) &&
        Objects.equals(this.validfromdate, eetsettingsigncertificate.validfromdate) &&
        Objects.equals(this.validtodate, eetsettingsigncertificate.validtodate) &&
        Objects.equals(this.certificatehash, eetsettingsigncertificate.certificatehash) &&
        Objects.equals(this.certificatedata, eetsettingsigncertificate.certificatedata) &&
        Objects.equals(this.certificatepassword, eetsettingsigncertificate.certificatepassword) &&
        Objects.equals(this.certificateactive, eetsettingsigncertificate.certificateactive) &&
        Objects.equals(this.certificatesize, eetsettingsigncertificate.certificatesize) &&
        Objects.equals(this.storename, eetsettingsigncertificate.storename) &&
        Objects.equals(this.subjectname, eetsettingsigncertificate.subjectname) &&
        Objects.equals(this.issuername, eetsettingsigncertificate.issuername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, parentId, repository, validfromdate, validtodate, certificatehash, certificatedata, certificatepassword, certificateactive, certificatesize, storename, subjectname, issuername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eetsettingsigncertificate {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    validfromdate: ").append(toIndentedString(validfromdate)).append("\n");
    sb.append("    validtodate: ").append(toIndentedString(validtodate)).append("\n");
    sb.append("    certificatehash: ").append(toIndentedString(certificatehash)).append("\n");
    sb.append("    certificatedata: ").append(toIndentedString(certificatedata)).append("\n");
    sb.append("    certificatepassword: ").append(toIndentedString(certificatepassword)).append("\n");
    sb.append("    certificateactive: ").append(toIndentedString(certificateactive)).append("\n");
    sb.append("    certificatesize: ").append(toIndentedString(certificatesize)).append("\n");
    sb.append("    storename: ").append(toIndentedString(storename)).append("\n");
    sb.append("    subjectname: ").append(toIndentedString(subjectname)).append("\n");
    sb.append("    issuername: ").append(toIndentedString(issuername)).append("\n");
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

