package com.rocky.eighteeners.forum.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Rocky Ren
 * @description <p></p>
 * @date 2022/7/4 22:32
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EssayBO implements Serializable {

    private String id;

    private String author;

    private String sourceUrl;

    private String title;

    private String type;
}
