package com.example.telegram_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewid=findViewById<ListView>(R.id.listview)

        val data= arrayListOf<Datamodel>(

            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),
            Datamodel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fman%2520face%2F&psig=AOvVaw2AiRA-zXaXVnkdbc3-4px9&ust=1696006169309000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCOj03cDhzYEDFQAAAAAdAAAAABAE","sonu", "somu@gmail.com"),

            )

        val Adapter=CustomAdapter(this,data)
        listViewid.adapter=Adapter
    }
}