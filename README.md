

## ServiceSample

onStartCommand的返回值int类型才是最最值得注意的：            
它有三种可选值：              
1、START_STICKY                            被杀后重启         
2、START_NOT_STICKY                        被杀后不重启           
3、START_REDELIVER_INTENT                  被杀后带Intent重启        


## 参考项目
1、[Android中Service使用bindService](https://blog.csdn.net/zjws23786/article/details/51865238)         

## 参考文献
1、
