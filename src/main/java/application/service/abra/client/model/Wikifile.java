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
 * Wikifile
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Wikifile   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("blobdata")
  private byte[] blobdata = null;

  @SerializedName("space_id")
  private String spaceId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("isimage")
  private Boolean isimage = null;

  @SerializedName("filesize")
  private Integer filesize = null;

  public Wikifile displayname(String displayname) {
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

  public Wikifile id(String id) {
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

  public Wikifile classid(String classid) {
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

  public Wikifile objversion(Integer objversion) {
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

  public Wikifile blobdata(byte[] blobdata) {
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

  public Wikifile spaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

   /**
   * prostor; id objektu wiki prostor [persistentní položka]
   * @return spaceId
  **/
  @ApiModelProperty(example = "null", value = "prostor; id objektu wiki prostor [persistentní položka]")
  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public Wikifile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * cesta [persistentní položka]
   * @return path
  **/
  @ApiModelProperty(example = "null", value = "cesta [persistentní položka]")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Wikifile isimage(Boolean isimage) {
    this.isimage = isimage;
    return this;
  }

   /**
   * obrázek [persistentní položka]
   * @return isimage
  **/
  @ApiModelProperty(example = "null", value = "obrázek [persistentní položka]")
  public Boolean getIsimage() {
    return isimage;
  }

  public void setIsimage(Boolean isimage) {
    this.isimage = isimage;
  }

  public Wikifile filesize(Integer filesize) {
    this.filesize = filesize;
    return this;
  }

   /**
   * velikost souboru [persistentní položka]
   * @return filesize
  **/
  @ApiModelProperty(example = "null", value = "velikost souboru [persistentní položka]")
  public Integer getFilesize() {
    return filesize;
  }

  public void setFilesize(Integer filesize) {
    this.filesize = filesize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wikifile wikifile = (Wikifile) o;
    return Objects.equals(this.displayname, wikifile.displayname) &&
        Objects.equals(this.id, wikifile.id) &&
        Objects.equals(this.classid, wikifile.classid) &&
        Objects.equals(this.objversion, wikifile.objversion) &&
        Objects.equals(this.blobdata, wikifile.blobdata) &&
        Objects.equals(this.spaceId, wikifile.spaceId) &&
        Objects.equals(this.path, wikifile.path) &&
        Objects.equals(this.isimage, wikifile.isimage) &&
        Objects.equals(this.filesize, wikifile.filesize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, blobdata, spaceId, path, isimage, filesize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wikifile {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    blobdata: ").append(toIndentedString(blobdata)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    isimage: ").append(toIndentedString(isimage)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
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
