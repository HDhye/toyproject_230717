package com.hdhye.toyproject.board.model.dto;

import com.hdhye.toyproject.common.SelectCriteria;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
public class BoardListRes {

    private List<BoardDTO> boardList;
    private SelectCriteria selectCriteria;


    public BoardListRes(List<BoardDTO> boardList, SelectCriteria selectCriteria) {
        this.boardList = boardList;
        this.selectCriteria = selectCriteria;
    }

}
