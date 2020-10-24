package me.dev.oliver.youtubesns.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class VideoDto {

  private Integer id;

  private String userId;

  @NotBlank
  private String title;

  @NotBlank
  private String detailContents;

  private String createdAt;

  private String updatedAt;

  private Integer likeCount;

  private Integer badCount;

  /**
   * 조회수
   */
  private int hits;

  private String fileUrl;

  private long fileSize;

  public VideoDto(int id) {

    this.id = id;
  }

  public VideoDto(String fileUrl) {

    this.fileUrl = fileUrl;
  }

  public VideoDto(String fileUrl, long fileSize, String userId, String title,
      String detailContents) {

    this.fileUrl = fileUrl;
    this.fileSize = fileSize;
    this.userId = userId;
    this.title = title;
    this.detailContents = detailContents;
  }

}
