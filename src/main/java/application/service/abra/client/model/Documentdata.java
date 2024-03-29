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
 * Documentdata
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Documentdata   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("revided_id")
  private String revidedId = null;

  @SerializedName("revisiondescription")
  private String revisiondescription = null;

  @SerializedName("revisiondate$date")
  private DateTime revisiondatedate = null;

  @SerializedName("revisionauthor_id")
  private String revisionauthorId = null;

  @SerializedName("revision")
  private Integer revision = null;

  @SerializedName("blobdata")
  private byte[] blobdata = null;

  @SerializedName("compressed")
  private Boolean compressed = null;

  @SerializedName("originalsize")
  private Integer originalsize = null;

  @SerializedName("compressedsize")
  private Integer compressedsize = null;

  public Documentdata displayname(String displayname) {
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

  public Documentdata id(String id) {
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

  public Documentdata classid(String classid) {
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

  public Documentdata objversion(Integer objversion) {
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

  public Documentdata revidedId(String revidedId) {
    this.revidedId = revidedId;
    return this;
  }

   /**
   * id revidovaného objektu; id objektu data dokumentu
   * @return revidedId
  **/
  @ApiModelProperty(example = "null", value = "id revidovaného objektu; id objektu data dokumentu")
  public String getRevidedId() {
    return revidedId;
  }

  public void setRevidedId(String revidedId) {
    this.revidedId = revidedId;
  }

  public Documentdata revisiondescription(String revisiondescription) {
    this.revisiondescription = revisiondescription;
    return this;
  }

   /**
   * popis revize
   * @return revisiondescription
  **/
  @ApiModelProperty(example = "null", value = "popis revize")
  public String getRevisiondescription() {
    return revisiondescription;
  }

  public void setRevisiondescription(String revisiondescription) {
    this.revisiondescription = revisiondescription;
  }

  public Documentdata revisiondatedate(DateTime revisiondatedate) {
    this.revisiondatedate = revisiondatedate;
    return this;
  }

   /**
   * datum revize
   * @return revisiondatedate
  **/
  @ApiModelProperty(example = "null", value = "datum revize")
  public DateTime getRevisiondatedate() {
    return revisiondatedate;
  }

  public void setRevisiondatedate(DateTime revisiondatedate) {
    this.revisiondatedate = revisiondatedate;
  }

  public Documentdata revisionauthorId(String revisionauthorId) {
    this.revisionauthorId = revisionauthorId;
    return this;
  }

   /**
   * autor revize; id objektu uživatel
   * @return revisionauthorId
  **/
  @ApiModelProperty(example = "null", value = "autor revize; id objektu uživatel")
  public String getRevisionauthorId() {
    return revisionauthorId;
  }

  public void setRevisionauthorId(String revisionauthorId) {
    this.revisionauthorId = revisionauthorId;
  }

  public Documentdata revision(Integer revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Číslo revize
   * @return revision
  **/
  @ApiModelProperty(example = "null", value = "Číslo revize")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public Documentdata blobdata(byte[] blobdata) {
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

  public Documentdata compressed(Boolean compressed) {
    this.compressed = compressed;
    return this;
  }

   /**
   * komprimován [persistentní položka]
   * @return compressed
  **/
  @ApiModelProperty(example = "null", value = "komprimován [persistentní položka]")
  public Boolean getCompressed() {
    return compressed;
  }

  public void setCompressed(Boolean compressed) {
    this.compressed = compressed;
  }

  public Documentdata originalsize(Integer originalsize) {
    this.originalsize = originalsize;
    return this;
  }

   /**
   * původní velikost [persistentní položka]
   * @return originalsize
  **/
  @ApiModelProperty(example = "null", value = "původní velikost [persistentní položka]")
  public Integer getOriginalsize() {
    return originalsize;
  }

  public void setOriginalsize(Integer originalsize) {
    this.originalsize = originalsize;
  }

  public Documentdata compressedsize(Integer compressedsize) {
    this.compressedsize = compressedsize;
    return this;
  }

   /**
   * komprimovaná velikost [persistentní položka]
   * @return compressedsize
  **/
  @ApiModelProperty(example = "null", value = "komprimovaná velikost [persistentní položka]")
  public Integer getCompressedsize() {
    return compressedsize;
  }

  public void setCompressedsize(Integer compressedsize) {
    this.compressedsize = compressedsize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Documentdata documentdata = (Documentdata) o;
    return Objects.equals(this.displayname, documentdata.displayname) &&
        Objects.equals(this.id, documentdata.id) &&
        Objects.equals(this.classid, documentdata.classid) &&
        Objects.equals(this.objversion, documentdata.objversion) &&
        Objects.equals(this.revidedId, documentdata.revidedId) &&
        Objects.equals(this.revisiondescription, documentdata.revisiondescription) &&
        Objects.equals(this.revisiondatedate, documentdata.revisiondatedate) &&
        Objects.equals(this.revisionauthorId, documentdata.revisionauthorId) &&
        Objects.equals(this.revision, documentdata.revision) &&
        Objects.equals(this.blobdata, documentdata.blobdata) &&
        Objects.equals(this.compressed, documentdata.compressed) &&
        Objects.equals(this.originalsize, documentdata.originalsize) &&
        Objects.equals(this.compressedsize, documentdata.compressedsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, revidedId, revisiondescription, revisiondatedate, revisionauthorId, revision, blobdata, compressed, originalsize, compressedsize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documentdata {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    revidedId: ").append(toIndentedString(revidedId)).append("\n");
    sb.append("    revisiondescription: ").append(toIndentedString(revisiondescription)).append("\n");
    sb.append("    revisiondatedate: ").append(toIndentedString(revisiondatedate)).append("\n");
    sb.append("    revisionauthorId: ").append(toIndentedString(revisionauthorId)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    blobdata: ").append(toIndentedString(blobdata)).append("\n");
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    originalsize: ").append(toIndentedString(originalsize)).append("\n");
    sb.append("    compressedsize: ").append(toIndentedString(compressedsize)).append("\n");
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

