package gible.domain.post.dto;

import gible.domain.post.entity.Post;

import java.time.LocalDateTime;
import java.util.UUID;

public record PostTitleRes(
        UUID postId,
        String title,
        LocalDateTime createdAt,
        String content
) {
    public static PostTitleRes fromEntity(Post post) {
        return new PostTitleRes(post.getId(), post.getTitle(), post.getCreatedAt(), post.getContent());
    }
}
