package nginx.clojure;

public interface NginxRequest {
	
	public long nativeRequest();
	
	 //for safe access with another thread
	public void	prefetchAll();
	
	public NginxHandler handler();
	
	public NginxServerChannel channel();
	
	public boolean isHijacked();
	
}
