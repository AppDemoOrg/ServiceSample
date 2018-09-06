

## ServiceSample

onStartCommand的返回值int类型才是最最值得注意的：            
它有三种可选值：              
1、START_STICKY                            被杀后重启         
2、START_NOT_STICKY                        被杀后不重启           
3、START_REDELIVER_INTENT                  被杀后带Intent重启        


## 参考文献
1、
