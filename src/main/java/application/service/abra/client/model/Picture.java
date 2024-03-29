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

import java.util.Objects;


/**
 * Picture
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Picture   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid2 = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("blobdata")
  private byte[] blobdata = null;

  @SerializedName("picturetitle")
  private String picturetitle = null;

  @SerializedName("externalfile")
  private Boolean externalfile = null;

  @SerializedName("pathandfilename")
  private String pathandfilename = null;

  @SerializedName("refcount")
  private Integer refcount = null;

  @SerializedName("isprotected")
  private Boolean isprotected = null;

  @SerializedName("class_id")
  private String classId = null;

  @SerializedName("class_name")
  private String className = null;

  public Picture displayname(String displayname) {
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

  public Picture id(String id) {
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

  public Picture classid2(String classid) {
    this.classid2 = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid2() {
    return classid2;
  }

  public void setClassid2(String classid) {
    this.classid2 = classid;
  }

  public Picture objversion(Integer objversion) {
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

  public Picture blobdata(byte[] blobdata) {
    this.blobdata = blobdata;
    return this;
  }

   /**
   * data [persistentní položka]
   * @return blobdata
  **/
  @ApiModelProperty(example = "null", value = "data [persistentní položka]")
  public byte[] getBlobdata() {
    return blobdata;
  }

  public void setBlobdata(byte[] blobdata) {
    this.blobdata = blobdata;
  }

  public Picture picturetitle(String picturetitle) {
    this.picturetitle = picturetitle;
    return this;
  }

   /**
   * popis [persistentní položka]
   * @return picturetitle
  **/
  @ApiModelProperty(example = "null", value = "popis [persistentní položka]")
  public String getPicturetitle() {
    return picturetitle;
  }

  public void setPicturetitle(String picturetitle) {
    this.picturetitle = picturetitle;
  }

  public Picture externalfile(Boolean externalfile) {
    this.externalfile = externalfile;
    return this;
  }

   /**
   * externí [persistentní položka]
   * @return externalfile
  **/
  @ApiModelProperty(example = "null", value = "externí [persistentní položka]")
  public Boolean getExternalfile() {
    return externalfile;
  }

  public void setExternalfile(Boolean externalfile) {
    this.externalfile = externalfile;
  }

  public Picture pathandfilename(String pathandfilename) {
    this.pathandfilename = pathandfilename;
    return this;
  }

   /**
   * cesta a soubor [persistentní položka]
   * @return pathandfilename
  **/
  @ApiModelProperty(example = "null", value = "cesta a soubor [persistentní položka]")
  public String getPathandfilename() {
    return pathandfilename;
  }

  public void setPathandfilename(String pathandfilename) {
    this.pathandfilename = pathandfilename;
  }

  public Picture refcount(Integer refcount) {
    this.refcount = refcount;
    return this;
  }

   /**
   * počet referencí [persistentní položka]
   * @return refcount
  **/
  @ApiModelProperty(example = "null", value = "počet referencí [persistentní položka]")
  public Integer getRefcount() {
    return refcount;
  }

  public void setRefcount(Integer refcount) {
    this.refcount = refcount;
  }

  public Picture isprotected(Boolean isprotected) {
    this.isprotected = isprotected;
    return this;
  }

   /**
   * chráněn [persistentní položka]
   * @return isprotected
  **/
  @ApiModelProperty(example = "null", value = "chráněn [persistentní položka]")
  public Boolean getIsprotected() {
    return isprotected;
  }

  public void setIsprotected(Boolean isprotected) {
    this.isprotected = isprotected;
  }

  public Picture classId(String classId) {
    this.classId = classId;
    return this;
  }

   /**
   * třída vlastníka - guid [persistentní položka]
   * @return classId
  **/
  @ApiModelProperty(example = "null", value = "třída vlastníka - guid [persistentní položka]")
  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public Picture className(String className) {
    this.className = className;
    return this;
  }

   /**
   * třída vlastníka - název
   * @return className
  **/
  @ApiModelProperty(example = "null", value = "třída vlastníka - název")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Picture picture = (Picture) o;
    return Objects.equals(this.displayname, picture.displayname) &&
        Objects.equals(this.id, picture.id) &&
        Objects.equals(this.classid2, picture.classid2) &&
        Objects.equals(this.objversion, picture.objversion) &&
        Objects.equals(this.blobdata, picture.blobdata) &&
        Objects.equals(this.picturetitle, picture.picturetitle) &&
        Objects.equals(this.externalfile, picture.externalfile) &&
        Objects.equals(this.pathandfilename, picture.pathandfilename) &&
        Objects.equals(this.refcount, picture.refcount) &&
        Objects.equals(this.isprotected, picture.isprotected) &&
        Objects.equals(this.classId, picture.classId) &&
        Objects.equals(this.className, picture.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid2, objversion, blobdata, picturetitle, externalfile, pathandfilename, refcount, isprotected, classId, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Picture {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid2)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    blobdata: ").append(toIndentedString(blobdata)).append("\n");
    sb.append("    picturetitle: ").append(toIndentedString(picturetitle)).append("\n");
    sb.append("    externalfile: ").append(toIndentedString(externalfile)).append("\n");
    sb.append("    pathandfilename: ").append(toIndentedString(pathandfilename)).append("\n");
    sb.append("    refcount: ").append(toIndentedString(refcount)).append("\n");
    sb.append("    isprotected: ").append(toIndentedString(isprotected)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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

