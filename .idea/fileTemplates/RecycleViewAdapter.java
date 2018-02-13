#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end 
import android.content.Context; 
import android.support.annotation.LayoutRes; 
import android.support.v7.widget.RecyclerView; 
import android.view.LayoutInflater; 
import android.view.View; 
import android.view.ViewGroup; 
import java.util.List; 
#parse("File Header.java") 
public class ${NAME} extends RecyclerView.Adapter<${NAME}.ViewHolder> { 
private Context ctx; private List<Object> objects; 
public ${NAME}(Context ctx, List<Object> objects) { 
this.ctx = ctx; this.objects = objects; 
} 
private @LayoutRes int provideItemLayout() { 
    // todo 
return 0; 
} 
@Override 
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { 
View view = LayoutInflater.from(ctx).inflate(provideItemLayout(), parent, false); 
return new ViewHolder(view); 
} 
@Override 
public void onBindViewHolder(ViewHolder holder, int position) { 
holder.bind(objects.get(position)); 
} 
@Override 
public int getItemCount() { 
return objects == null ? 0 : objects.size(); 
} 
public static class ViewHolder extends RecyclerView.ViewHolder { 
public ViewHolder(View itemView) { 
super(itemView); 
     //todo 
} 
public void bind(Object o) { 
     // todo 
} } } 
