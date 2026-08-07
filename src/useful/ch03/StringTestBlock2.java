package useful.ch03;

public class StringTestBlock2 {
    public static void main(String[] args) {

        String textBlock = """
                
                    <!doctype html>
                    <html lang="ko"><head><meta charset="utf-8">
                    <meta name="viewport" content="user-scalable=no, initial-scale=1, width=device-width, viewport-fit=cover">
                    <title>HTML - 나무위키</title>
                    <script src="https://securepubads.g.doubleclick.net/tag/js/gpt.js" async></script>
                    <script src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js?client=ca-pub-7162146779303471" crossorigin="anonymous"></script>
                    <meta http-equv="x-ua-compatible" content="ie=edge">
                    <meta name="generator" content="the seed">
                    <meta name="mobile-web-app-capable" content="yes">
                    <meta name="application-name" content="나무위키">
                    <meta name="msapplication-tooltip" content="나무위키">
                    <meta name="color-scheme" content="light dark">
                    <meta name="msapplication-starturl" content="/w/%EB%82%98%EB%AC%B4%EC%9C%84%ED%82%A4:%EB%8C%80%EB%AC%B8">
                    <meta name="robots" content="max-image-preview:large">
                    <meta property="og:title" content="HTML">
                    <meta property="og:site_name" content="나무위키">
                    <meta property="og:image" content="//i.namu
                """;
        changText(textBlock);
    }

    public static void changText(String str){
        System.out.println(str.replace("나무위키", "위키피디아"));
    }
}
