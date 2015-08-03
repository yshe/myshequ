package com.community.common.picTool;



public class JpegToolException extends Exception {
        private String errMsg = ""; 
        public JpegToolException(String errMsg) 
        { 
                this.errMsg = errMsg; 
        } 

        public String getMsg(){ 
            return "JpegToolException:"+this.errMsg; 
        } 
}