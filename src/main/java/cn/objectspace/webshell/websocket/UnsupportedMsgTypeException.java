package cn.objectspace.webshell.websocket;


public class UnsupportedMsgTypeException extends Exception
{
    public UnsupportedMsgTypeException(String errMessage)
    {
        super(errMessage);
    }
}