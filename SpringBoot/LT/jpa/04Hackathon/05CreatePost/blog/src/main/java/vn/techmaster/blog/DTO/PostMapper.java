package vn.techmaster.blog.DTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import vn.techmaster.blog.controller.request.PostRequest;
import vn.techmaster.blog.model.Post;

@Mapper
public interface PostMapper {
  PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);
  Post postRequestToPost(PostRequest postRequest);

  
  @Mapping(target="user_id", source="post.user.id")
  PostPOJO postToPostPOJO(Post post);
}