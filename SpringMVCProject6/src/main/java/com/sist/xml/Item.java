package com.sist.xml;
/*
 *   <title>[씬의 한수]‘F등급’ 영화 개봉 잇따라…여성의 복수 ‘리벤지’</title>
<link>
http://www.ichannela.com/news/main/news_detailPage.do?publishId=000000202999
</link>
<description>
<![CDATA[
매주 금요일 주목할 만한 영화와 게임을 소개해드리는 씬의 한 수 시간입니다. 오늘도 이현용 기자 함께 합니다. 이 기자, 오늘은 어떤 영화 고르셨나요? [답변] 혹시 F등급 영화라고 아시나요? [질문] 학점 F는 아닐테고...
]]>
</description>
<pubDate>Fri, 15 May 2020 12:16:00 +0900</pubDate>
<author>채널A</author>
<category>생활/문화</category>
<media:thumbnail url="https://imgnews.pstatic.net/image/thumb140/449/2020/05/15/191746.jpg"/>
 */
public class Item {
    private String title;
    private String link;
    private String description;
    private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	   
}
