package com_pcwk_ehr06;

import java.io.IOException;//try catch 에러 

import com_pcwk_ehr_cmn.pcwLog;
//Jsoup
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class CGVJsoup implements pcwLog {

	public static void main(String[] args) {
		String url = "http://www.cgv.co.kr/movies/?lt=1&ft=0";//cgv 무비차트
		final int VIEW_MOVIES = 10;
		
		try {
			Document doc = Jsoup.connect(url).get();
//			LOG.debug("*********************************");
//			LOG.debug(doc.toString());
//			LOG.debug("*********************************");
			
			//div : html
			//div.box-contents : style
			//' ' : html 태그와 태그 구분자
			
			
			Elements titles = doc.select("div.box-contents strong.title");
			Elements reservRto = doc.select("div.score strong.percent span");
			Elements movieDate = doc.select("span.txt-info");
			Elements poster= doc.select("div.box-image span.thumb-image img");


	
			for(int i=0;i<VIEW_MOVIES;i++) {
				Element titleElement = titles.get(i);
				Element reservRtoElement = reservRto.get(i);
				Element movieDateElement = movieDate.get(i);
				//Element posterElement = poster.get(i);
				
				//attr():html 태그에 속성 접근
				String posterURL = poster.get(i).attr("src");
				String movieDateElement_replace = movieDateElement.text().replace("개봉","");
				
				
				LOG.debug((i+1)+"."+titleElement.text()+", "+
				"예매율 : " + reservRtoElement.text()+", "+
				"개봉일 : " + movieDateElement_replace + ", "+
				//LOG.debug((i+1)+"."+reservRtoElement.text());
				"포스터 : " + posterURL);
	
			}			
	
		}catch(IOException e){
			LOG.debug("====================");
			LOG.debug("IOException="+e.getMessage());
			LOG.debug("====================");
		}
				
	}

}
