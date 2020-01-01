package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController{

	@RequestMapping("/getBoard.do")
	public ModelAndView getBoardController(BoardVO vo) {
		System.out.println("글 상세 조회 처리");
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);

		// 3. 응답 화면 구성
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoard.jsp");
		mav.addObject("board", board);
		return mav;
	}

}
