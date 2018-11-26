package clases;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import kongdom.com.recyclerv.R;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioHolder> {
    @NonNull
    @Override
    public UsuarioHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row,ViewGroup,false);
        return new UsuarioHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioHolder usuarioHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }
    private Context context;
    private ArrayList<Usuario> usuarios;
    public UsuarioAdapter(Context context, ArrayList<Usuario> usuarios){
        this.context = context;
        this.usuarios = usuarios;
    }

}

class UsuarioHolder extends RecyclerView.ViewHolder {

    private TextView txvNombre, txvDistancia, txvValoracion, txvCantidad;

    public UsuarioHolder(@NonNull View itemView) {
        super(itemView);

        txvNombre = itemView.findViewsWithText(R.id.txv_nombre);
        txvValoracion = itemView.findViewsWithText(R.id.txv_valoracion);
        txvDistancia = itemView.findViewsWithText(R.id.txv_distancia);
        txvCantidad = itemView.findViewsWithText(R.id.txv_cantidad);
    }

    public void definirDetalles(Usuario usuario){
        txvNombre.setText("Usuario :" + usuario.getNombreUsuario());
        txvValoracion.setText("Valoracion :" + usuario.getValoracion());
        txvDistancia.setText("Se encuentra a :" + usuario.getDistancia());
        txvCantidad.setText("Quiere un total de :" + usuario.getCantidadCondones());
    }
}
