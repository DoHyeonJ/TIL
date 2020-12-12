# C# 이란? 
- MS에서 개발되었으며, C++와 Java에서 강한 영향을 받은 객체지향 프로그래밍 언어다. 
(.NET 프로젝트와 함께 발표되었음)
- 유니티의 실행 코드로도 유명하며, 확장자는 .cs다.
.Net Core부터 리눅스를 공식지원했으며, .Net Core 3.0부터는 MacOS에서도 잘 동작함.
- 코드구조 
```
using System;

namespace Namu
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, world!");
        }
    }
}
```

# Java와의 차이
- Java에 JVM이 필요하듯이 C#은 .Net Framework가 필요하다. 
( .Net Framework 대신 비교적 작은 사이즈의 가상머신에 올려서 실행시키는 방법도있음)

# .NET Core 란?
- MS에서 C#, VB.NET 등 모든 닷넷 프레임워크 기반 언어를 Windows, macOS, Linux 기반에서 작동하도록 만든 오픈 소스 프레임워크이다.

# Windows Forms 와 WPF
- Windows Forms는 MS에 포함된 무료 오픈 소스 그래픽(GUI) 클래스 라이브러리다.
- WPF(Windows Presentation Foundation)는 Windows Forms의 부족한 기능 및 디자인 기능을 대처하기 위해 있는 디자인 특화 사용자 인터페이스이다.
- WPF는 코드로 UI를 만드는 Windows Forms와 달리 XML 기반 마크업 언어인 XAML을 사용한다.

# 그밖의 내용
- 기본적으로 C언어의 포인터 변수를 지원하지 않는다. 다만, unsafe 키워드를 사용하면 C언어 형태의 포인터 변수를 선언하고 사용할 수 있다. 또한 마샬링 계열에서의 사용이나, 윈도우 Handle 오브젝트를 제어하기 위한 IntPtr이라는 포인터 클래스가 선언되어 있다. 포인터 변수를 지원하지 않는 대신 ref, out 키워드를 사용하여 포인터와 유사하게 작업할 수 있다.


